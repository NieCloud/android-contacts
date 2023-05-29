package ru.yandex.practicum.contacts.presentation.base;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.DiffUtil;

import ru.yandex.practicum.contacts.presentation.main.ContactUi;
import ru.yandex.practicum.contacts.presentation.sort.SortTypeUI;

public class BaseListDiffCallback<T extends ListDiffInterface> extends DiffUtil.ItemCallback<T> {


    @Override
    public boolean areItemsTheSame(@NonNull T oldItem, @NonNull T newItem) {
        return oldItem.theSameAs(newItem);
    }

    @Override
    public boolean areContentsTheSame(@NonNull T oldItem, @NonNull T newItem) {
        return oldItem.equals(newItem);
    }
    public T getChangePayload(@NonNull T oldItem, @NonNull T newItem) {
        return newItem;
    }

}
